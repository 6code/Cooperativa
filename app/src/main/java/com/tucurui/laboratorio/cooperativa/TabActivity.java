package com.tucurui.laboratorio.cooperativa;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.tucurui.laboratorio.cooperativa.fragment.FragmentCadastro;
import com.tucurui.laboratorio.cooperativa.fragment.FragmentCaixa;
import com.tucurui.laboratorio.cooperativa.fragment.FragmentEstoque;
import com.tucurui.laboratorio.cooperativa.fragment.FragmentPageAdapter;
import com.tucurui.laboratorio.cooperativa.fragment.fragmentRelatorio;

public class TabActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        //recupero pelo id
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);

        FragmentPageAdapter adapter = new FragmentPageAdapter(getSupportFragmentManager());

        //adiciono meu fragments no adpter
        adapter.addFragment(new FragmentCaixa(), "CAIXA");
        adapter.addFragment(new FragmentCadastro(), "CADASTRO");
        adapter.addFragment(new FragmentEstoque(), "ESTOQUE");
        adapter.addFragment(new fragmentRelatorio(), "RELATÓRIO");


        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
