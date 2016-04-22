/* 
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Oleg Kurbatov (o.v.kurbatov@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.firmata4j;

/**
 * The listener interface for receiving events from {@link Encoder}. When encoder's
 * position changes, the relevant method in the listener object is invoked.
 *
 * @author Jeffrey Kuhn &lt;drjrkuhn@gmail.com&gt;
 */
public interface EncoderEventListener {
    
    /**
     * Invoked when encoder's position changes.
     * @param event encodes the encoder number and new position
     */
    public void onPositionChange(IOEvent event);
    
    /**
     * Invoked after encoder is attached.
     * @param event encodes the encoder number and new position
     */
    public void onAttach(IOEvent event);
    
    /**
     * Invoked after encoder is detached.
     * @param event encodes the encoder number and new position
     */
    public void onDetach(IOEvent event);
}
