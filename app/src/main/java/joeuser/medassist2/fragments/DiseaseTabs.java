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

public class DiseaseTabs {
    public static class TreatmentTab extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_treatment, container, false);
            return rootView;
        }
    }

    public static class SymptomsTab extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_symptoms, container, false);
            return rootView;
        }

    }

    public static class DiagnosisTab extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_diagnosis, container, false);
            return rootView;
        }


    }
}
