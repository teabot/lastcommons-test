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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@DirtiesContext
public class BeforeSpringClassDataFolderIntegrationTest extends AbstractSpringClassDataFolderTestCase {

  @Autowired
  private String someString;

  @Before
  public void someShit() throws IOException {
    assertNotNull(folder.getFolder());
  }

  @Test
  public void integration() throws IOException {
    assertTrue(dataFile.exists());
    assertTrue(dataFile.canRead());
    assertTrue(dataFile.getAbsolutePath().endsWith(
        getClass().getName().replaceAll("\\.", File.separator) + File.separator + DATA_FILE));
  }

}
