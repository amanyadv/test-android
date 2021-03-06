package com.ibusl.android.register.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ibusl.android.register.R;

import butterknife.ButterKnife;

/**
 * Created by aman on 12/4/16.
 */
public class ReportsFragment extends Fragment {
    private static final String LOG_TAG = ReportsFragment.class.getSimpleName();

    public ReportsFragment() {
        // Required empty public constructor
    }

    public static ReportsFragment newInstance() {
        return new ReportsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_reports, container, false);
        ButterKnife.bind(ReportsFragment.this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(ReportsFragment.class);
    }
}
