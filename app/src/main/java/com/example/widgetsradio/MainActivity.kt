package com.example.widgetsradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.widgetsradio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.radioGroup.setOnCheckedChangeListener { group, chkId ->
		// group : 이벤트가 발생한 라디오버튼 그룹 객체
		// chkId : 이벤트를 발생시킨 라디오 버튼의 id
		// R.id. : 안드로이드가 리소스를 관리할 때 사용하는 R이라는 클래스 
		// R클래스 안의 리소스들 아이디를 관리할 때 id객체가 만들어진다.
		// 위젯의 id값을 사용할 때 R.id.아이디로 사용하면 됨	
			if (chkId == R.id.radioApple) {
				Log.d("radioTest", "사과 선택")
			} else if (chkId == R.id.radioBanana) {
				Log.d("radioTest", "바나나 선택")
 			} else if (chkId == R.id.radioOrange) {
				Log.d("radioTest", "오렌지 선택")
			}
			// 위의 if문과 동일한 작업을 하는 when 문을 작성

			when (chkId) {
				R.id.radioApple -> { Log.d("radioTest2", "사과 선택") }
				R.id.radioBanana -> { Log.d("radioTest2", "바나나 선택1") }
				R.id.radioOrange -> { Log.d("radioTest2", "오랜지 선택2") }
			}
		}
	}
}
