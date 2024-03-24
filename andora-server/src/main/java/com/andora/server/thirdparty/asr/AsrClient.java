package com.andora.server.thirdparty.asr;

import com.andora.server.thirdparty.asr.dto.AsrRequestDTO;
import com.andora.server.thirdparty.asr.dto.AsrResponseDTO;

import java.util.function.Consumer;

/**
 * .
 *
 * @author: leven.chen
 * @date: 2024/3/24 19:15
 */
public interface AsrClient {

    /**
     * Voic Rrecognition
     */
    AsrResponseDTO voicRrecognition(AsrRequestDTO request);


    /**
     * Voic Rrecognition
     */
    void voicRrecognition(AsrRequestDTO request, Consumer<AsrResponseDTO> consumer);
}
