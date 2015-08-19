package com.sohu.live56.view.main.player;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sohu.live56.R;
import com.sohu.live56.view.BaseFragment;
import com.sohu.live56.view.util.JchSwitchButton;
import com.sohu.live56.view.util.LiveButton;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link LiveFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LiveFrag extends BaseFragment implements View.OnClickListener {


    private TextView livelocaltiontv;
    private ImageButton videofragclose;
    private ImageButton livecameraib;
    private JchSwitchButton livevoicesb;
    private JchSwitchButton liveflishlightsb;
    private ImageView liveweixinshare;
    private ImageView livefriendsshare;
    private ImageView livemicroblogshare;
    private ImageView liveqqshare;
    private ImageView livezoneshare;
    private LinearLayout livebtmtitlell;
    private TextView livetimetv;
    private LiveButton livestatebtn;
    private RelativeLayout livebtmfl;

    public static LiveFrag newInstance() {
        LiveFrag fragment = new LiveFrag();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    public LiveFrag() {
        // Required empty public constructor
    }

    @Override
    public void onSetEventListener(OnFragmentInteractionListener listener) {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_live, container, false);
        initialize(view);
        return view;
    }

    private void initialize(View view) {

        livelocaltiontv = (TextView) view.findViewById(R.id.live_localtion_tv);
        videofragclose = (ImageButton) view.findViewById(R.id.video_frag_close);
        livecameraib = (ImageButton) view.findViewById(R.id.live_camera_ib);
        livevoicesb = (JchSwitchButton) view.findViewById(R.id.live_voice_sb);
        liveflishlightsb = (JchSwitchButton) view.findViewById(R.id.live_flishlight_sb);
        liveweixinshare = (ImageView) view.findViewById(R.id.live_weixin_share);
        livefriendsshare = (ImageView) view.findViewById(R.id.live_friends_share);
        livemicroblogshare = (ImageView) view.findViewById(R.id.live_microblog_share);
        liveqqshare = (ImageView) view.findViewById(R.id.live_qq_share);
        livezoneshare = (ImageView) view.findViewById(R.id.live_zone_share);
        livebtmtitlell = (LinearLayout) view.findViewById(R.id.live_btm_title_ll);
        livetimetv = (TextView) view.findViewById(R.id.live_time_tv);
        livestatebtn = (LiveButton) view.findViewById(R.id.live_state_btn);
        livebtmfl = (RelativeLayout) view.findViewById(R.id.live_btm_fl);

        livecameraib.setOnClickListener(this);
        JchSwitchButton.OnJchSwitchListener switchListener = new MyJchSwitchListener();
        liveflishlightsb.setJchSwitchListener(switchListener);
        livevoicesb.setJchSwitchListener(switchListener);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.video_frag_close: {

                break;
            }

            case R.id.live_camera_ib: {

            }
        }

    }


    private class MyJchSwitchListener implements JchSwitchButton.OnJchSwitchListener {

        @Override
        public void onSwitchEvent(View view, boolean switchFlage) {
            switch (view.getId()) {
                case R.id.live_voice_sb: {

                    break;
                }
                case R.id.live_flishlight_sb: {

                    break;
                }
            }
        }
    }
}
