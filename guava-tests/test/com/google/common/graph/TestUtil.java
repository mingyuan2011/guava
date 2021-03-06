/*
 * Copyright (C) 2016 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.graph;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.Iterators;
import java.util.Collection;

/**
 * Utility methods used in various common.graph tests.
 */
class TestUtil {

  private TestUtil() {}

  /**
   * In some cases our graph implementations return custom collections that define their own size()
   * and contains(). Verify that those methods are consistent with the elements of the iterator.
   */
  static void sanityCheckCollection(Collection<?> collection) {
    assertThat(collection).hasSize(Iterators.size(collection.iterator()));
    for (Object element : collection) {
      assertThat(collection).contains(element);
    }
  }
}
