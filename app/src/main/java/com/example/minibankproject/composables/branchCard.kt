package com.example.minibankproject.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.minibankproject.data.BranchModel
import com.example.minibankproject.data.BranchType

@Composable
fun BranchCard(
    branch: BranchModel,
    modifier: Modifier = Modifier,
    onClick: (BranchModel) -> Unit = {},
    isFavorite: Boolean = false
) {
    val colors = MaterialTheme.colorScheme

    val (containerColor, contentColor) = when {
        isFavorite -> colors.tertiaryContainer to colors.onTertiaryContainer
        branch.type == BranchType.MAIN -> colors.primaryContainer to colors.onPrimaryContainer
        else -> colors.secondaryContainer to colors.onSecondaryContainer
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable { onClick(branch) },
        colors = CardDefaults.cardColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = if (isFavorite) "🌟 ${branch.name}" else branch.name,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = branch.type.name,
                    style = MaterialTheme.typography.labelLarge,
                    color = contentColor.copy(alpha = 0.75f)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "📍 ${branch.location}",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "📞 ${branch.phone}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}