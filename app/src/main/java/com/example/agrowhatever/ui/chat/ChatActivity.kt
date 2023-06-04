import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.agrowhatever.R

class ChatActivity : AppCompatActivity() {
    private lateinit var chatScrollView: ScrollView
    private lateinit var chatMessagesLayout: LinearLayout
    private lateinit var messageEditText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_activity)

        chatScrollView = findViewById(R.id.chatScrollView)
        chatMessagesLayout = findViewById(R.id.chatMessagesLayout)
        messageEditText = findViewById(R.id.messageEditText)
        sendButton = findViewById(R.id.sendButton)

        sendButton.setOnClickListener {
            val message = messageEditText.text.toString().trim()
            if (message.isNotEmpty()) {
                addChatMessage(message)
                messageEditText.text.clear()
            }
        }
    }

    private fun addChatMessage(message: String) {
        val textView = TextView(this)
        textView.text = message
        chatMessagesLayout.addView(textView)

        // Scroll para a última mensagem adicionada
        chatScrollView.postDelayed({
            chatScrollView.fullScroll(View.FOCUS_DOWN)
        }, 100)
    }
}
