package fr.paris.lutece.plugins.releasertest;

import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Fails on purpose : used by the releaser team to check that the platform step pipeline keeps releasing the other components when this one
 * fails (step 4 without fail-fast). Remove this class once the check is done.
 */
public class DeliberateFailureTest
{
    /**
     * Always fails.
     */
    @Test
    public void testDeliberateFailure( )
    {
        fail( "Deliberate failure : recette of the platform step pipeline without fail-fast" );
    }
}
