package com.alfiansyah.catatanku.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alfiansyah.catatanku.ui.theme.BabyBlue
import com.alfiansyah.catatanku.ui.theme.LightGreen
import com.alfiansyah.catatanku.ui.theme.RedOrange
import com.alfiansyah.catatanku.ui.theme.RedPink
import com.alfiansyah.catatanku.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
