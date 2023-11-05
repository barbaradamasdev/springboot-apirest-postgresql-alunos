package com.bddev.springboot.controllers;

import com.bddev.springboot.dtos.AlunoRecordDto;
import com.bddev.springboot.models.AlunoModel;
import com.bddev.springboot.repositories.AlunoRepository;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @Operation(summary = "Adiciona um novo aluno", method = "POST")
    @PostMapping("/alunos")
    public ResponseEntity<AlunoModel> saveAluno(@RequestBody @Valid AlunoRecordDto alunoRecordDto) {
        var alunoModel = new AlunoModel();
        BeanUtils.copyProperties(alunoRecordDto, alunoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepository.save(alunoModel));
    }

    @Operation(summary = "Retorna todos os alunos", method = "GET")
    @GetMapping("/alunos")
    public ResponseEntity<List<AlunoModel>> getAllAluno(){
        return ResponseEntity.status(HttpStatus.OK).body(alunoRepository.findAll());
    }

    @Operation(summary = "Busca aluno por id", method = "GET")
    @GetMapping("/alunos/{id}")
    public ResponseEntity<Object> getOneAlunos(@PathVariable(value = "id")UUID id) {
        Optional<AlunoModel> aluno0 = alunoRepository.findById(id);
        if(aluno0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno nao encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(aluno0);
    }

    @Operation(summary = "Atualiza aluno por id", method = "PUT")
    @PutMapping("/alunos/{id}")
    public ResponseEntity<Object> updateAluno(@PathVariable(value = "id")UUID id,
                                              @RequestBody @Valid AlunoRecordDto alunoRecordDto) {
        Optional<AlunoModel> aluno0 = alunoRepository.findById(id);
        if(aluno0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno nao encontrado.");
        }
        var alunoModel = aluno0.get();
        BeanUtils.copyProperties(alunoRecordDto, alunoModel);
        return ResponseEntity.status(HttpStatus.OK).body(alunoRepository.save(alunoModel));
    }

    @Operation(summary = "Apaga um aluno por id", method = "DELETE")
    @DeleteMapping("/alunos/{id}")
    public ResponseEntity<Object> deleteAluno(@PathVariable(value = "id")UUID id) {
        Optional<AlunoModel> aluno0 = alunoRepository.findById(id);
        if(aluno0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno nao encontrado.");
        }
        alunoRepository.delete(aluno0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Aluno deletado com sucesso.");
    }
}


