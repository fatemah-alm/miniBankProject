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


    fun selectBranch(branch: BranchModel) {
        selectedBranch = branch
    }


    fun markAsFavoriteBranch(branch: BranchModel) {
        favoriteBranch = branch
    }

}