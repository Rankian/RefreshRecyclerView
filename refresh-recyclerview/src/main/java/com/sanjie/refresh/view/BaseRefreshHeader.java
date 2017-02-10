package com.sanjie.refresh.view;

/**
 * Created by SanJie on 17/2/9.
 */
interface BaseRefreshHeader {

	int STATE_NORMAL = 0;
	int STATE_RELEASE_TO_REFRESH = 1;
	int STATE_REFRESHING = 2;
	int STATE_DONE = 3;

	void onMove(float delta);

	boolean releaseAction();

	void refreshComplete();

}