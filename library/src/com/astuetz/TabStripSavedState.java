package com.astuetz;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.view.View;

class TabStripSavedState extends View.BaseSavedState {
    int currentPosition;

    public TabStripSavedState(Parcelable superState) {
        super(superState);
    }

    private TabStripSavedState(Parcel in) {
        super(in);
        currentPosition = in.readInt();
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(currentPosition);
    }

    public static final Creator<TabStripSavedState> CREATOR = new Creator<TabStripSavedState>() {
        @Override
        public TabStripSavedState createFromParcel(@NonNull Parcel in) {
            return new TabStripSavedState(in);
        }

        @NonNull
        @Override
        public TabStripSavedState[] newArray(int size) {
            return new TabStripSavedState[size];
        }
    };
}
