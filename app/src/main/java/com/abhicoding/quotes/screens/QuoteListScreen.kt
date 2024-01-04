package com.abhicoding.quotes.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.abhicoding.quotes.model.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote: Quote)->Unit) {
    Column {
        Text(
            text = "The Quotes",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth(1f)
                .background(
                    Brush.linearGradient(
                        listOf( Color.Cyan, Color.Blue)
                    )
                ).padding(8.dp, 14.dp),
            style = MaterialTheme.typography.titleLarge,
            fontFamily = FontFamily.Cursive
        )
        QuoteList(data = data, onClick)

    }
}