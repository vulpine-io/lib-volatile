/*
 * Copyright 2016 Elizabeth Harper
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
package io.vulpine.lib.vol;

/**
 * Volatile Key/Value Pair Container
 *
 * @author Elizabeth Harper [elliefops@gmail.com]
 * @version 1.0
 * @since 0.0.1
 */
public class VolatilePair < K, V >
{
  private volatile K key;
  private volatile V value;

  public VolatilePair( final K key, final V value )
  {
    setKey(key);
    setValue(value);
  }

  public VolatilePair()
  {
  }

  public K getKey()
  {
    return key;
  }

  public synchronized void setKey( final K key )
  {
    this.key = key;
  }

  public V getValue()
  {
    return value;
  }

  public synchronized void setValue( final V value )
  {
    this.value = value;
  }
}
