package com.example.bottomnavwithfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ProfileFragment:Fragment() {
    companion object{
        val TAG: String = "로그"

        fun newInstance():ProfileFragment{
            return ProfileFragment()
        }
    }


    // 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"HomeFragment - onCreate() called")
    }

    // 프레그먼트를 안고 있는 액티비티에 붙었을때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"HomeFragment - onAttach() called")
    }

    // 뷰가 생성되었을 때 MainActivity의 onCreate와 같음
    // 프레그먼트와 레이아웃을 연결시켜주는 부분이다.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d(TAG,"HomeFragment - onCreateView() called")
        val view=inflater.inflate(R.layout.fragment_profile,container,false)
        return view
    }
}