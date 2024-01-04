package com.abhicoding.quotes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.abhicoding.quotes.model.Quote

@Composable
fun QuoteListItem(quote: Quote, onClick:(Quote) -> Unit) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(10.dp),
        modifier = Modifier
            .clickable { onClick(quote) }
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                imageVector = Icons.Filled.FormatQuote,
                contentDescription = "Quote",
                alignment = Alignment.TopStart,
                colorFilter = ColorFilter.tint(Color.Cyan),
                modifier = Modifier
                    .size(40.dp)
                    .rotate(180F)
                    .background(Color.White)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = quote.quote,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Box(
                    modifier = Modifier
                        .background(Color.Cyan)
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    text = quote.author,
                    fontFamily = FontFamily.Cursive,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}


