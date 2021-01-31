package com.example.bottomnavwithfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

// 바텀 네이게이션 아이템 셀렉티드 리스너를 상속
class MainActivity : AppCompatActivity(),BottomNavigationView.OnNavigationItemSelectedListener {

    // 멤버변수 선언
    private lateinit var homeFragment: HomeFragment
    private lateinit var rankingFragment: RankingFragment
    private lateinit var profileFragment: ProfileFragment


    companion object{
        val TAG: String = "로그"
    }

    // 메모리에 올라갔을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 레이아웃과 연결
        setContentView(R.layout.activity_main)

        Log.d(TAG,"MainActivity - onCreate() called")


        bottom_nav_view.setOnNavigationItemSelectedListener(this)

        // 처음에 프래그먼트를 올려야하기 때문에 add 이용
        homeFragment=HomeFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.fragments_frame,homeFragment).commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_home->{
                Log.d(TAG,"MainActivity - 홈 버튼 클릭")
                homeFragment=HomeFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame,homeFragment).commit()
            }
            R.id.menu_profile->{
                Log.d(TAG,"MainActivity - 메뉴 버튼 클릭")
                profileFragment=ProfileFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame,profileFragment).commit()
            }
            R.id.menu_rank->{
                Log.d(TAG,"MainActivity - 랭킹 버튼 클릭")
                rankingFragment=RankingFragment.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame,rankingFragment).commit()
            }
        }

        return true
    }
}