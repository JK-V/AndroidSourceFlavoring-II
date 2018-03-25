package com.sdk.library;

/**
 * Generic flavor Implementation of {@link AuthenticationManager}.
 */

class DefaultAuthenticationManager implements AuthenticationManager {

    private AuthenticationManagerMain mAuthenticationManagerMain;

    public DefaultAuthenticationManager() {
        mAuthenticationManagerMain = new DefaultAuthenticationManagerMain();
    }

    @Override
    public void pinAuthentication() {
        mAuthenticationManagerMain.pinAuthentication();
    }

    @Override
    public void fingerprintAuthentication() {
        mAuthenticationManagerMain.fingerprintAuthentication();
    }

    @Override
    public void patternAuthentication() {
        mAuthenticationManagerMain.patternAuthentication();
    }

    @Override
    public void retinaAuthentication() {
        mAuthenticationManagerMain.retinaAuthentication();
    }

    @Override
    public void faceAuthentication() {
        mAuthenticationManagerMain.faceAuthentication();
    }
}
