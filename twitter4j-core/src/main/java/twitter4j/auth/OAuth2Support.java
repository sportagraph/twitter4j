package twitter4j.auth;

import twitter4j.TwitterException;

/**
 * @author KOMIYA Atsushi - komiya.atsushi at gmail.com
 * @see <a href="https://dev.twitter.com/docs/auth/application-only-auth">Application-only authentication | Twitter Developers</a>
 */
public interface OAuth2Support {
    /**
     * Sets the OAuth consumer key and consumer secret.
     *
     * @param consumerKey    OAuth consumer key
     * @param consumerSecret OAuth consumer secret
     * @throws IllegalStateException when OAuth consumer has already been set, or the instance is using basic authorization.
     */
    void setOAuthConsumer(String consumerKey, String consumerSecret);

    /**
     * Obtains an OAuth 2 Bearer token.
     *
     * @return
     * @throws TwitterException      when Twitter service or network is unavailable, or connecting non-SSL endpoints.
     * @throws IllegalStateException when Bearer token is already available, or OAuth consumer is not available.
     * @see <a href="https://dev.twitter.com/docs/api/1.1/post/oauth2/token">POST oauth2/token | Twitter Developers</a>
     */
    OAuth2Token getOAuth2Token() throws TwitterException;

    /**
     * Sets the OAuth 2 Bearer token.
     *
     * @param oauth2Token OAuth 2 Bearer token
     */
    void setOAuth2Token(OAuth2Token oauth2Token);

    /**
     * Revokes an issued OAuth 2 Bearer Token.
     *
     * @throws TwitterException      when Twitter service or network is unavailable, or connecting non-SSL endpoints.
     * @throws IllegalStateException when Bearer token is not available.
     */
    void invalidateOAuth2Token() throws TwitterException;
}
