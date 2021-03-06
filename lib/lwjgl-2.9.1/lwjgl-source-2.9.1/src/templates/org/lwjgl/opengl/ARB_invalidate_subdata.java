/*
 * Copyright (c) 2002-2012 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.lwjgl.opengl;

import org.lwjgl.util.generator.AutoSize;
import org.lwjgl.util.generator.Const;
import org.lwjgl.util.generator.Reuse;
import org.lwjgl.util.generator.opengl.*;

import java.nio.IntBuffer;

public interface ARB_invalidate_subdata {

	@Reuse("GL43")
	void glInvalidateTexSubImage(@GLuint int texture, int level,
	                             int xoffset, int yoffset, int zoffset,
	                             @GLsizei int width, @GLsizei int height, @GLsizei int depth);

	@Reuse("GL43")
	void glInvalidateTexImage(@GLuint int texture, int level);

	@Reuse("GL43")
	void glInvalidateBufferSubData(@GLuint int buffer, @GLintptr long offset, @GLsizeiptr long length);

	@Reuse("GL43")
	void glInvalidateBufferData(@GLuint int buffer);

	@Reuse("GL43")
	void glInvalidateFramebuffer(@GLenum int target,
	                             @AutoSize("attachments") @GLsizei int numAttachments,
	                             @Const @GLenum IntBuffer attachments);

	@Reuse("GL43")
	void glInvalidateSubFramebuffer(@GLenum int target,
	                                @AutoSize("attachments") @GLsizei int numAttachments,
	                                @Const @GLenum IntBuffer attachments,
	                                int x, int y, @GLsizei int width, @GLsizei int height);

}