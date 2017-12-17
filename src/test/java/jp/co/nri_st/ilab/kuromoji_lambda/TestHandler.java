/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.nri_st.ilab.kuromoji_lambda;

import com.atilika.kuromoji.ipadic.Token;
import java.util.List;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author zamatetsuya
 */
public class TestHandler {
    @Test
    public void testKuromoji(){
        final Handler handler = new Handler();
        final String dummyInput = "すもももももももものうち";
        
        final List<Token> tokens = handler.handleRequest(dummyInput, null);
        assertEquals(7,tokens.size());
    }
}
