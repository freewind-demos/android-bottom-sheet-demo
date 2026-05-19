package demos.android.bottom.sheet.demo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

/**
 * BottomSheet 底部弹出面板演示
 * 展示 Modal BottomSheet 和 Persistent BottomSheet 的使用
 */
class MainActivity : AppCompatActivity() {

    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.resultText)

        // Modal BottomSheet - 从底部弹出的对话框
        findViewById<Button>(R.id.showModalBtn).setOnClickListener {
            showModalBottomSheet()
        }

        // Persistent BottomSheet - 作为布局一部分的底部面板
        findViewById<Button>(R.id.showPersistentBtn).setOnClickListener {
            resultText.text = "点击了 Persistent BottomSheet"
        }
    }

    // 显示 Modal BottomSheet
    private fun showModalBottomSheet() {
        val bottomSheet = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_content, null)

        val option1 = view.findViewById<TextView>(R.id.option1)
        val option2 = view.findViewById<TextView>(R.id.option2)
        val option3 = view.findViewById<TextView>(R.id.option3)

        option1.setOnClickListener {
            resultText.text = "选择了: 分享"
            bottomSheet.dismiss()
        }

        option2.setOnClickListener {
            resultText.text = "选择了: 复制链接"
            bottomSheet.dismiss()
        }

        option3.setOnClickListener {
            resultText.text = "选择了: 删除"
            bottomSheet.dismiss()
        }

        bottomSheet.setContentView(view)
        bottomSheet.show()
    }
}
