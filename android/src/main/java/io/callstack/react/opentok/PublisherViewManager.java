package io.callstack.react.opentok;

import android.util.Log;

import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ThemedReactContext;

public class PublisherViewManager extends SessionViewManager<PublisherView> {
    @Override
    public String getName() {
        return "RCTOpenTokPublisherView";
    }

    @Override
    protected PublisherView createViewInstance(ThemedReactContext reactContext) {
        return new PublisherView(reactContext);
    }

    @ReactMethod
    public void test() {
        Log.i("test", "test");
    }
}
