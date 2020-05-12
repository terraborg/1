package com.example.myapplication;

import android.graphics.Rect;

class SettingsButton extends CanvasButton {
	int type;
	SettingsButton(Rect rect, String msg, DrawThread drawThread, int type) {
		super(rect, msg, drawThread);
		this.type=type;
	}

	@Override
	void onTouch() {
		super.onTouch();
		super.getDrawThread().onSettingsTouch(type);
	}
}
