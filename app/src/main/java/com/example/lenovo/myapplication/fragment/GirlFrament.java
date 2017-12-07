package com.example.lenovo.myapplication.fragment;
/*
 * 项目名：    MyApplication
 * 包名：      com.example.lenovo.myapplication.fragment
 * 文件名：    GirlFrament
 * 创建者：    guiyu
 * 创建时间：  2017/12/7 17:15
 * 描述：      美女图片
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.myapplication.R;

public class GirlFrament extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_girl, null);
        return view;
    }
}
