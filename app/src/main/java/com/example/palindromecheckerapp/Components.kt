package com.example.palindromecheckerapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResultTemplate(
    title: String,
    input: String,
    result: Boolean,
    onBack: () -> Unit,
    details: String? = null
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // 1. Header
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 2. Data Display Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("Tested Input:", style = MaterialTheme.typography.labelLarge)
                Text(
                    text = "\"$input\"",
                    style = MaterialTheme.typography.headlineSmall,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )

                if (details != null) {
                    HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))
                    Text("Process/Details:", style = MaterialTheme.typography.labelLarge)
                    Text(text = details, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // 3. The Big Verdict
        Text(
            text = if (result) "✓ PALINDROME" else "✗ NOT A PALINDROME",
            fontSize = 22.sp,
            fontWeight = FontWeight.Black,
            color = if (result) Color(0xFF2E7D32) else Color(0xFFC62828)
        )

        Spacer(modifier = Modifier.height(48.dp))

        // 4. Navigation
        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(0.5f)
        ) {
            Text("Try Another Case")
        }
    }
}