package srijareddy.s3612607.mentalhealthcompanion

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UserHomeScreen() {
    Scaffold(
        containerColor = Color(0xFFF7F7FB),
        bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(vertical = 14.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("⌂ Home", fontWeight = FontWeight.Bold)
                Text("☺ Mood")
                Text("✎ Journal")
                Text("♡ Wellness")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Mind Ease",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF34495E)
            )
            Text(
                text = "Take a moment for yourself today.",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray
            )

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE7F2EE))
            ) {
                Column(Modifier.padding(18.dp)) {
                    Text("Today's mood", fontWeight = FontWeight.SemiBold)
                    Spacer(Modifier.height(8.dp))
                    Text("Not recorded yet", style = MaterialTheme.typography.bodyLarge)
                    Spacer(Modifier.height(12.dp))
                    Button(onClick = { /* Open mood tracking */ }) {
                        Text("Record your mood")
                    }
                }
            }

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF1EAF8))
            ) {
                Column(Modifier.padding(18.dp)) {
                    Text("A thought for today", fontWeight = FontWeight.SemiBold)
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = "“Small steps still move you forward.”",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

            Text(
                text = "Take a moment",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                WellnessButton(
                    label = "Meditation",
                    modifier = Modifier.weight(1f),
                    onClick = { /* Open meditation */ }
                )
                WellnessButton(
                    label = "Breathing",
                    modifier = Modifier.weight(1f),
                    onClick = { /* Open breathing exercise */ }
                )
            }

            Button(
                onClick = { /* Open journal */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Write in your journal")
            }
        }
    }
}

@Composable
private fun WellnessButton(
    label: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier.heightIn(min = 52.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(label)
    }
}

@Preview(showBackground = true)
@Composable
private fun MindEaseHomeScreenPreview() {
    MaterialTheme {
        UserHomeScreen()
    }
}