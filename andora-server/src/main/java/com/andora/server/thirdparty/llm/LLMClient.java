package com.andora.server.thirdparty.llm;

import com.andora.server.thirdparty.llm.dto.LLMRequestDTO;
import com.andora.server.thirdparty.llm.dto.LLMResponseDTO;

/**
 * .
 *
 * @author: leven.chen
 * @date: 2024/3/24 19:33
 */
public interface LLMClient {

    LLMResponseDTO chat(LLMRequestDTO request);
}
