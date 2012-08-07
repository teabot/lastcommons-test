/*
 * Copyright 2012 Last.fm
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package fm.last.commons.test.file;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.junit.rules.MethodRule;

public interface DataFolder extends MethodRule {

  File getFolder() throws IOException;

  File getFile(String relativePath) throws IOException;

  String getAbsolutePath(String relativePath) throws IOException;

  URI getUri(String relativePath) throws IOException;

}
