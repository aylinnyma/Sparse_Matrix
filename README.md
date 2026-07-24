# Sparse Matrix Determinant

This project implements a sparse square matrix using a row-wise linked list representation and computes its determinant using the recursive Laplace expansion algorithm.

## Features

- Row-wise linked list sparse matrix implementation
- Recursive determinant calculation using Laplace expansion
- File input 
- Sparse representation that stores ONLY non-zero values
- Determinant algorithm independent of sparse matrix 

## Project Structure

- `SparseMatrix` – abstract matrix interface
- `RowWiseMatrix` – row-wise linked list with sparse matrix implementation
- `Node` – linked list node representing a non-zero matrix element
- `Determinant` – recursive Laplace determinant calculation

Only non-zero matrix elements should be included, matrix indices are 1-based.
