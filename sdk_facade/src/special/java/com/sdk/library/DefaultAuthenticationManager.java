package com.sdk.library;

/**
 * Special flavor Implementation of {@link AuthenticationManager}.
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
}
