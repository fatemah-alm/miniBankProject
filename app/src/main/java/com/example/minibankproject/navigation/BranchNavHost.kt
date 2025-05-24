package com.example.minibankproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.minibankproject.composables.BranchDetails
import com.example.minibankproject.composables.BranchList
import com.example.minibankproject.viewModel.BranchViewModel

enum class NavRoutesEnum(val value: String) {
    NAV_ROUTE_BRANCH_LIST("branchList"),
    NAV_ROUTE_BRANCH_DETAILS("branchDetails");
}

@Composable
fun BranchNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavRoutesEnum.NAV_ROUTE_BRANCH_LIST.value,
    branchViewModel: BranchViewModel = viewModel()
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavRoutesEnum.NAV_ROUTE_BRANCH_LIST.value) {
            BranchList(
                branchViewModel = branchViewModel,
                onCardClicked = { branch ->
                    branchViewModel.selectBranch(branch)
                    navController.navigate(NavRoutesEnum.NAV_ROUTE_BRANCH_DETAILS.value)
                }
            )
        }

        composable(NavRoutesEnum.NAV_ROUTE_BRANCH_DETAILS.value) {
            BranchDetails(
                branchViewModel = branchViewModel,
                navController = navController
            )
        }
    }
}