package com.example.lenovo.myapplication.fragment;
/*
 * 项目名：    MyApplication
 * 包名：      com.example.lenovo.myapplication.fragment
 * 文件名：    ButlerFragment
 * 创建者：    guiyu
 * 创建时间：  2017/12/7 16:59
 * 描述：      管家服务
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.myapplication.R;

public class ButlerFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_butler,null);
        return view;
    }
}
