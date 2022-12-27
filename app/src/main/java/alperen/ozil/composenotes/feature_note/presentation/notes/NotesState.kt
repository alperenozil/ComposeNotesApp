package alperen.ozil.composenotes.feature_note.presentation.notes

import alperen.ozil.composenotes.feature_note.domain.model.Note
import alperen.ozil.composenotes.feature_note.domain.util.NoteOrder
import alperen.ozil.composenotes.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
