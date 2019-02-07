/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.initializr.generator.spring.build;

import java.io.IOException;
import java.io.Writer;

import io.spring.initializr.generator.buildsystem.Build;
import io.spring.initializr.generator.buildsystem.BuildSystem;

/**
 * Strategy that can be implemented by a {@link BuildSystem} that can generate a proper
 * build representation for the project in a single text asset.
 *
 * @author Stephane Nicoll
 */
public interface BuildWriter {

	/**
	 * Write the {@link Build} to the specified {@link Writer}.
	 * @param out the writer to use
	 * @throws IOException if writing the build to {@code out} failed
	 */
	void writeBuild(Writer out) throws IOException;

}
