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
        adapter.addFragment(new FragmentCadastro(), ".");
        adapter.addFragment(new FragmentEstoque(), ".");
        adapter.addFragment(new fragmentRelatorio(), ".");
        adapter.addFragment(new FragmentCaixa(), ".");


        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.getTabAt(0).setIcon(R.drawable.user);
        mTabLayout.getTabAt(1).setIcon(R.drawable.relatorio);
        mTabLayout.getTabAt(2).setIcon(R.drawable.relater);
        mTabLayout.getTabAt(3).setIcon(R.drawable.money);




    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.mover_esquerda,R.anim.saida);
    }
}
