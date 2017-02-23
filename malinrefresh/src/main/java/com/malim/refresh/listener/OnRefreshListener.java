package com.malim.refresh.listener;

import com.malim.refresh.listener.RefreshListener;
import com.malim.refresh.weight.MalinRefreshLayout;

public abstract class OnRefreshListener implements RefreshListener {
        @Override
        public void onPullingDown(MalinRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullingUp(MalinRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullDownReleasing(MalinRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullUpReleasing(MalinRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onRefresh(MalinRefreshLayout refreshLayout) {
        }

        @Override
        public void onLoadMore(MalinRefreshLayout refreshLayout) {
        }

        @Override
        public void onFinishRefresh() {

        }

        @Override
        public void onFinishLoadMore() {

        }

        @Override
        public void onRefreshCanceled() {

        }

        @Override
        public void onLoadmoreCanceled() {

        }
}