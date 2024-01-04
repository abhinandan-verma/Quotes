package com.abhicoding.quotes.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.abhicoding.quotes.model.DataManager
import com.abhicoding.quotes.model.Quote

@Composable
fun QuoteDetail(quote: Quote) {
    BackHandler {
        DataManager.switchPages(null)
    }
    Box(
        modifier = Modifier
            .fillMaxSize(1f)
    ) {
        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier
                .padding(10.dp)
                .background(
                    Brush.linearGradient(
                        listOf(Color.Yellow, Color.Magenta, Color.Cyan)
                    )
                )
        ) {
            Image(
                imageVector = Icons.Filled.FormatQuote,
                contentDescription = "Quote",
                modifier = Modifier
                    .size(80.dp)
                    .rotate(180F)
                    .background(Color.Cyan)
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .background(
                        Brush.linearGradient(
                            listOf(Color.Yellow, Color.Magenta, Color.Cyan)
                        )
                    )
                    .padding(8.dp)
            ) {
                Text(
                    text = quote.quote,
                    style = MaterialTheme.typography.headlineMedium,
                    fontFamily = FontFamily.Cursive
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = quote.author,
                    fontFamily = FontFamily.Monospace,
                    style = MaterialTheme.typography.titleMedium
                )

            }

        }
    }
}