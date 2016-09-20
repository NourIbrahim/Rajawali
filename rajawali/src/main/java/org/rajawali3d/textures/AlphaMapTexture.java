/**
 * Copyright 2013 Dennis Ippel
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.rajawali3d.textures;

import android.content.Context;
import android.support.annotation.NonNull;

public class AlphaMapTexture extends ASingleTexture {
	private float mAlphaMaskingThreshold = .5f;

	public AlphaMapTexture(AlphaMapTexture other)
	{
		super(other);
	}

	public AlphaMapTexture(String textureName)
	{
		super(TextureType.ALPHA, textureName);
	}

	public AlphaMapTexture(String textureName, @NonNull Context context, int resourceId)
	{
		super(TextureType.ALPHA, textureName);
		setResourceId(context, resourceId);
	}

	public AlphaMapTexture(String textureName, TextureDataReference textureData)
	{
		super(TextureType.ALPHA, textureName, textureData);
	}

	public AlphaMapTexture(String textureName, ACompressedTexture compressedTexture)
	{
		super(TextureType.ALPHA, textureName, compressedTexture);
	}

	public AlphaMapTexture clone() {
		return new AlphaMapTexture(this);
	}

	public void setAlphaMaskingThreshold(float threshold)
	{
		mAlphaMaskingThreshold = threshold;
	}

	public float getAlphaMaskingThreshold()
	{
		return mAlphaMaskingThreshold;
	}
}
