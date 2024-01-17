'use client';
import React from 'react';
import Form from './Form';

const Input = () => {
  return (
    <section className="flex flex-col h-[82%] bg-primary w-full p-8 text-secondary">
      <div className="flex gap-8 justify-center w-full py-8">
        <div>Back-Arrow</div>
        <div>ProgressionBoxes</div>
      </div>

      <div className="flex-col gap-8 w-full justify-center items-center">
        <div className='flex justify-center'>
          <h1 className='p-4 text-2xl'>Personal characteristics</h1>
        </div>
        <Form />
      </div>
    </section>
  );
};

export default Input;
