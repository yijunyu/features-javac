/*
 * Copyright © 2018 Andrew Rice (acr31@cam.ac.uk)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.cam.acr31.features.javac.graph;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class FeatureNode {

  private static long counter = 0;

  abstract long nodeId();

  abstract NodeType nodeType();

  abstract String contents();

  static FeatureNode create(NodeType nodeType, String contents) {
    return new AutoValue_FeatureNode(counter++, nodeType, contents);
  }
}
