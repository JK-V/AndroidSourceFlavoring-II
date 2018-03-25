package com.sdk.library;

/**
 * Contract which lists all the accessible methods.
 */

interface AuthenticationManagerMain {

    void pinAuthentication();

    void fingerprintAuthentication();

    void patternAuthentication();

    //Below two are only accessible to privileged users of this flavor
    void retinaAuthentication();

    void faceAuthentication();
}
