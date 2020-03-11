package ua.andrew.criminalintent_2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
   protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
