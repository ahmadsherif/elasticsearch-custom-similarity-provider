package org.elasticsearch.index.similarity;

import org.apache.lucene.search.similarities.DefaultSimilarity;
import org.apache.lucene.index.FieldInvertState;
/**
 * Custom similarity class
 * 
 * @author tanguy
 *
 */
@SuppressWarnings("serial")
public class CustomSimilarity extends DefaultSimilarity {

  @Override
  public float lengthNorm(FieldInvertState state) {
    return state.getBoost();
  }
}
