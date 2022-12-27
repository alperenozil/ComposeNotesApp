package alperen.ozil.composenotes.feature_note.domain.model

import alperen.ozil.composenotes.ui.theme.Purple200
import alperen.ozil.composenotes.ui.theme.Purple500
import alperen.ozil.composenotes.ui.theme.Purple700
import alperen.ozil.composenotes.ui.theme.Teal200
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(Purple200, Purple500, Purple700, Teal200)
    }
}

class InvalidNoteException(message: String): Exception(message)