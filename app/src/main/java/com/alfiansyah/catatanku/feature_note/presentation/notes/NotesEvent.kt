package com.alfiansyah.catatanku.feature_note.presentation.notes

import com.alfiansyah.catatanku.feature_note.domain.model.Note
import com.alfiansyah.catatanku.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeletNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}