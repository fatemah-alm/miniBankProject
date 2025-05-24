package com.example.minibankproject.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.minibankproject.data.BranchModel
import com.example.minibankproject.viewModel.BranchViewModel


@Composable
fun BranchList(    modifier: Modifier = Modifier,
                   onCardClicked: (BranchModel) -> Unit = {},
                   branchViewModel:BranchViewModel = viewModel()) {
    val favorite = branchViewModel.favoriteBranch

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(branchViewModel.branchListState) { branch ->
            BranchCard(
                branch = branch,
                isFavorite = branch == favorite,
                onClick = onCardClicked
            )
        }
    }
}