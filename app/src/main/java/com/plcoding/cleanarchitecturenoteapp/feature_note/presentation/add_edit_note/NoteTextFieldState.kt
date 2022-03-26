package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val title: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true,
)
