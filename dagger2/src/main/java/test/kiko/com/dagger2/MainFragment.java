package test.kiko.com.dagger2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import test.kiko.com.dagger2.di.Injectable;

public class MainFragment extends Fragment implements Injectable {

    @Inject
    Login mLogin;

    private View mCachedView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCachedView = View.inflate(getContext(), R.layout.activity_main, null);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (container != null) {
            container.removeView(mCachedView);
        }
        return mCachedView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.e(MainFragment.class.getSimpleName(), "===========::::" + mLogin.getName());
    }
}
