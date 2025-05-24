package com.example.minibankproject.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.minibankproject.data.BranchModel
import com.example.minibankproject.repository.BranchRepository

class BranchViewModel : ViewModel() {
    var branchListState by mutableStateOf(BranchRepository.branches)
        private set
    var selectedBranch by mutableStateOf<BranchModel?>(null)
        private set
    var favoriteBranch by mutableStateOf<BranchModel?>(null)
        private set


    fun findBranch(name: String?): BranchModel? {
        return branchListState.find { it.name == name }
    }

    fun selectBranch(branch: BranchModel) {
        selectedBranch = branch
    }

    private fun updateBranchListState() {
        selectedBranch?.let { selected ->
            branchListState = branchListState
                .map { if (it.name == selected.name) selected else it }
        }
    }

    fun markAsFavoriteBranch(branch: BranchModel) {
        favoriteBranch = branch
    }

}