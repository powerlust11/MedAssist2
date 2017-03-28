package joeuser.medassist2.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joeuser.medassist2.R;

/**
 * Created by power on 3/27/2017.
 */

public class MedicalHistoryTabs {

    public static class SurgeriesTab extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_surgeries, container, false);
            return rootView;
        }
    }

    public static class PastVisitsTab extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_past_visits, container, false);
            return rootView;
        }




    }

    public static class IllnessesTab extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_illlnesses, container, false);
            return rootView;
        }
    }

    public static class AllergiesTab extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_allergies, container, false);
            return rootView;
        }
    }


}
